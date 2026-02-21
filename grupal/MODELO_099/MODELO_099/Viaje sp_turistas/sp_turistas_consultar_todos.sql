-- Consultar todos los turistas
DELIMITER $$
CREATE PROCEDURE sp_turista_consultar_todos ()
BEGIN
    SELECT * FROM Turistas;
END