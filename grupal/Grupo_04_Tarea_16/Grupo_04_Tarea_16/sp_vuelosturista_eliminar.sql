DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelosturista_eliminar`(
    IN codigo INT
)
BEGIN
    UPDATE VuelosTurista
    SET eliminado = 1
    WHERE CodigoVueloTurista = codigo;
END$$
DELIMITER ;