-- Eliminar un turista (físico)
DELIMITER $$
CREATE PROCEDURE sp_turista_eliminar (
    IN id INT
)
BEGIN
    DELETE FROM Turistas
    WHERE CodigoTuristas = id;
END