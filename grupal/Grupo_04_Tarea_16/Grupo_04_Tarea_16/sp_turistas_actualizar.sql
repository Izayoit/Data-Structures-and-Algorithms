DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_turistas_actualizar`(
	IN nombre VARCHAR(45), IN apellido VARCHAR(45),
	IN direccion VARCHAR(80), IN telefono VARCHAR(15),
	IN codigoTurista INT
)
BEGIN
	UPDATE turistas
	SET NombreTurista = nombre,
		ApellidosTurista = apellido,
		DireccionTurista = direccion,
		TelefonoTurista = telefono
	WHERE CodigoTuristas = codigoTurista;
END$$
DELIMITER ;