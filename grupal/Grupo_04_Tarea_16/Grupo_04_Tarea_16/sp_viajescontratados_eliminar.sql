DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_viajescontratados_eliminar`(
    IN codigo INT
)
BEGIN
    UPDATE ViajesContratados
    SET eliminado = 1
    WHERE CodigoViaje = codigo;
END$$
DELIMITER ;
