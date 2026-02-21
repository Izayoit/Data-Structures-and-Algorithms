CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estudiantes_consultar_todos`()
BEGIN
	DECLARE cantidad INT DEFAULT 0;

	-- Verificar si existen estudiantes activos
	SELECT COUNT(*) INTO cantidad FROM estudiantes WHERE eliminado = 0;

	IF cantidad > 0 THEN
		-- Si hay estudiantes activos, se listan
		SELECT * FROM estudiantes WHERE eliminado = 0;
	ELSE
		-- Si no hay, se lanza un mensaje de error
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No hay estudiantes registrados.';
	END IF;
END