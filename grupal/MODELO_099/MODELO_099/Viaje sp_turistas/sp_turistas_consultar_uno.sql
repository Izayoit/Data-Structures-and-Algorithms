-- Consultar un turista por ID
DELIMITER $$
CREATE PROCEDURE sp_turista_consultar_uno (
    OUT nom VARCHAR(45),
    OUT ape VARCHAR(45),
    OUT dir VARCHAR(80),
    OUT tel VARCHAR(10),
    IN id INT
)
BEGIN
    SELECT NombreTurista, ApellidosTurista, DireccionTurista, TelefonoTurista
    INTO nom, ape, dir, tel
    FROM Turistas
    WHERE CodigoTuristas = id;
END