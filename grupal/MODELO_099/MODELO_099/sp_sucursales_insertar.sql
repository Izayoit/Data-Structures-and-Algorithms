CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sucursales_insertar`(
    IN dato1  VARCHAR(45),
    IN dato2 VARCHAR(10),
    OUT dato3 INT
)
BEGIN
    INSERT INTO sucursales (DireccionSucursal, TelefonoSucursal)
    VALUES ( dato1 , dato2);
    SET dato3= LAST_INSERT_ID();
END