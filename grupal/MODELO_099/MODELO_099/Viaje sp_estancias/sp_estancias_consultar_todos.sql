-- Consultar todas las estancias
DELIMITER $$
CREATE PROCEDURE sp_estancias_consultar_todos ()
BEGIN
    SELECT * FROM Estancias;
END