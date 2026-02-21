DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_viajescontratados_insertar`(
    IN p_codigo_turista INT,
    IN p_codigo_sucursal INT,
    IN p_codigo_estancia INT
)
BEGIN
    INSERT INTO ViajesContratados (Turistas_CodigoTuristas, Sucursales_CodigoSucursal, Estancias_CodigoEstancia, eliminado)
    VALUES (p_codigo_turista, p_codigo_sucursal, p_codigo_estancia, 0);
END$$
DELIMITER ;