CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_sucursales_eliminar`(
    IN dato1 INT
)
BEGIN
   UPDATE sucursales
   SET eliminado = 1
	WHERE CodigoSucursal = dato1;
END