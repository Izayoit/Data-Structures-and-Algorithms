DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelos_actualizar`(
	IN fecha VARCHAR(45), IN hora VARCHAR(45),
	IN origen VARCHAR(45), IN destino VARCHAR(45),
	IN plazasTotales INT, IN plazasOcupadas INT,
	IN numeroVuelo INT
)
BEGIN
	UPDATE Vuelos
	SET FechaVuelo = fecha,
		HoraVuelo = hora,
		OrigenVuelo = origen,
		DestinoVuelo = destino,
		PlazasTotales = plazasTotales,
		PlazasTurista = plazasOcupadas
	WHERE NumeroVuelos = numeroVuelo;
END$$
DELIMITER ;