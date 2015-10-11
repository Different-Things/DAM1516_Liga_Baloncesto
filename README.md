# Liga de Baloncesto

Vamos a desarrollar un software para gestionar ligas de baloncesto. Para ello, trabajaremos con las entidades liga, equipo, estadio, persona, jugador, entrenador, árbitro, socio, presidente, partido, etc.

Por ejemplo, la entidad partido tendrá un equipo local, un equipo visitante, una fecha de celebración, un árbitro, un resultado, etc.

Avanzaremos de manera progresiva tanto a nivel funcional como a nivel tecnológico.

Empezaremos con la entidad jugador. La entidad jugador tendrá los siguientes atributos: un identificador, un nombre, una fecha de nacimiento, un número de canastas totales, un número de asistencias totales, un número de rebotes totales y una posición en el campo por defecto (alero, base, etc.).

Desarrollar un programa con Spring que sea capaz de realizar las siguientes funcionalidades:

- Dar de alta en la base de datos cinco jugadores con diferentes estadísticas (respecto al número de canastas, número de asistencias, etc.)
- Implementa la búsqueda de los jugadores por los siguientes criterios:
	* Buscar jugadores por nombre, de manera que no sea necesario introducir el nombre completo.
	* Buscar jugadores que hayan conseguido un número mayor o igual a un número de canastas especificado como parámetro.
	* Buscar jugadores que hayan efectuado un número de asistencias dentro de un rango especificado como parámetro (El rango se específica mediante un valor mínimo y un valor máximo).
	* Buscar jugadores que pertenezcan a una posición específica, por ejemplo: base
	* Buscar jugadores que hayan nacido en una fecha anterior a una fecha especificada como parámetro.
	* Combinar los apartados B y E: es decir, la consulta ha de devolver los jugadores que hayan conseguido un número total de canastas mayor o igual a un parámetro, y además que he nacido en una fecha anterior a una fecha especificada como parámetro.

Documentación de referencia para las consultas (podéis buscar la tabla número 4 para investigar muchos tipos de consultas posibles con Spring Data):
http://docs.spring.io/spring-data/jpa/docs/current/reference/html/

Código de ejemplo para desarrollar este ejercicio:
https://github.com/alfredorueda/DemoConsultaBaseDatos/blob/master/src/main/java/demo/Service/EmployeeService.java

