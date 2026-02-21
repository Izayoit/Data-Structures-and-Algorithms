DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hotel_consultar_todos`()
BEGIN
    SELECT * FROM hoteles
    WHERE eliminado = 0;
END$$
DELIMITER ;