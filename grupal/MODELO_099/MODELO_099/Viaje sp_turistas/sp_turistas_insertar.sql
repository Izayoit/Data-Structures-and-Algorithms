-- Insertar un Turista
DELIMITER $$
CREATE PROCEDURE `sp_turista_insertar` (
	IN nom VARCHAR(45),
	IN ape VARCHAR(45),
	IN dir VARCHAR(80),
	IN tel VARCHAR(10)
)
BEGIN
	INSERT INTO Turistas (NombreTurista, ApellidosTurista, DireccionTurista, TelefonoTurista)
	VALUES (nom, ape, dir, tel);
END