DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_viajescontratados_consultar_todos`()
BEGIN
    SELECT 
        vc.CodigoViaje,
        t.CodigoTuristas,
        CONCAT(t.NombreTurista, ' ', t.ApellidosTurista) AS NombreTurista,
        s.CodigoSucursal,
        s.DireccionSucursal,
        e.CodigoEstancia,
        e.Pension,
        e.FechaEntrada,
        e.FechaSalida,
        h.NombreHotel,
        h.CiudadHotel
    FROM ViajesContratados vc
    INNER JOIN Turistas t ON vc.Turistas_CodigoTuristas = t.CodigoTuristas
    INNER JOIN Sucursales s ON vc.Sucursales_CodigoSucursal = s.CodigoSucursal
    INNER JOIN Estancias e ON vc.Estancias_CodigoEstancia = e.CodigoEstancia
    INNER JOIN Hoteles h ON e.Hoteles_CodigoHotel = h.CodigoHotel;
END$$
DELIMITER ;
