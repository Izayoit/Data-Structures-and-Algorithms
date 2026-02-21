DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estancias_consultar_todos`()
BEGIN
    SELECT * FROM estancias
    WHERE eliminado = 0;
END$$
DELIMITER ;