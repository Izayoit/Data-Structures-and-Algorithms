CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estudiantes_insertar`(
	IN dato1 VARCHAR(60), IN dato2 VARCHAR(60), IN dato3 VARCHAR(60), IN dato4 VARCHAR(60), IN dato5 INT, IN dato6 INT,OUT dato7 INT
)
BEGIN
	DECLARE existe INT DEFAULT 0;

	-- Validar si ya existe un estudiante con el mismo DNI
	SELECT COUNT(*) INTO existe FROM estudiantes WHERE dni = dato1 AND eliminado = 0;

	IF existe = 0 THEN
		-- Insertar porque no existe
		INSERT INTO estudiantes(dni, nombres, apellidos, correo, telefono, id_carrera)
		VALUES (dato1, dato2, dato3, dato4, dato5, dato6);
		SET dato7 = LAST_INSERT_ID();
	ELSE
		-- Devolver 0 y evitar insertar duplicado
		SET dato7 = 0 ;
	END IF;
END