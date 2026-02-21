DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_turistas_insertar`(
	IN nombre VARCHAR(45), IN apellido VARCHAR(45),
	IN direccion VARCHAR(80), IN telefono VARCHAR(15),
	OUT id INT
)
BEGIN
	INSERT INTO turistas(NombreTurista, ApellidosTurista, DireccionTurista, TelefonoTurista)
	VALUES(nombre, apellido, direccion, telefono);
    
	SET id = LAST_INSERT_ID();
END$$
DELIMITER ;