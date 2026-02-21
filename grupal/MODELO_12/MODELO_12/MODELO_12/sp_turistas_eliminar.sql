CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_turistas_eliminar`(
	IN codigoTurista INT
)
BEGIN
	DELETE FROM turistas
	WHERE CodigoTuristas = codigoTurista;
END