-- Consultar todos los hoteles
DELIMITER $$
CREATE PROCEDURE sp_hotel_consultar_todos ()
BEGIN
    SELECT * FROM Hoteles;
END