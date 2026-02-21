-- Eliminar una estancia
DELIMITER $$
CREATE PROCEDURE sp_estancias_eliminar (
    IN idEstancia INT
)
BEGIN
    DELETE FROM Estancias
    WHERE CodigoEstancia = idEstancia;
END 