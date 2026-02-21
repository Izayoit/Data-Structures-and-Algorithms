CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelos_eliminar`(
	IN numeroVuelo INT
)
BEGIN
	DELETE FROM Vuelos
	WHERE NumeroVuelos = numeroVuelo;
END