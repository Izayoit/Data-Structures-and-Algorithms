DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sucursales_consultar_todos`()
BEGIN
    SELECT * FROM sucursales
    WHERE eliminado = 0;
END$$
DELIMITER ;