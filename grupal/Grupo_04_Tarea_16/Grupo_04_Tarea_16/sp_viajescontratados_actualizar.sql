DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_viajescontratados_actualizar`(
    IN p_codigoViaje INT,
    IN p_codigoTurista INT,
    IN p_codigoSucursal INT,
    IN p_codigoEstancia INT
)
BEGIN
    UPDATE ViajesContratados
    SET
        Turistas_CodigoTuristas = p_codigoTurista,
        Sucursales_CodigoSucursal = p_codigoSucursal,
        Estancias_CodigoEstancia = p_codigoEstancia
    WHERE
        CodigoViaje = p_codigoViaje
        AND eliminado = 0;
END$$
DELIMITER ;
