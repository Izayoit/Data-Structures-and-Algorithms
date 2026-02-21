DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_turistas_consultar_todos`()
BEGIN
	SELECT * FROM turistas
    WHERE eliminado = 0;
END$$
DELIMITER ;