CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sucursales_actualizar`(
    IN direccion VARCHAR(45),
    IN telefono VARCHAR(10),
    IN idsucursal INT
)
BEGIN
    UPDATE sucursales
    SET DireccionSucursal = direccion,
        TelefonoSucursal = telefono
    WHERE CodigoSucursal = idsucursal;
END