-- Actualizar un turista
DELIMITER $$
CREATE PROCEDURE sp_turista_actualizar (
    IN nom VARCHAR(45),
    IN ape VARCHAR(45),
    IN dir VARCHAR(80),
    IN tel VARCHAR(10),
    IN id INT
)
BEGIN
    UPDATE Turistas
    SET NombreTurista = nom,
        ApellidosTurista = ape,
        DireccionTurista = dir,
        TelefonoTurista = tel
    WHERE CodigoTuristas = id;
END