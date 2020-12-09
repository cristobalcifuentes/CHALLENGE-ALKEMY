# CHALLENGE-ALKEMY

#### Se desarrolla challenge propuesto por alkemy, los requerimientos estan detallados en el pdf adjuntado en el repositorio, como fecha maxima se da una semana para llevar a cabo. Ademas se adjunta modelo relacional, para ayudar a una mas rapida compresion de la solucion propuesta.

### Las tecnologias usadas son:
* java como lenguaje de programacion
* Spring como framework backend
* oracle como motor de base de datos
* jpa como api de persistencia
* hibernate como orm
* spring security para ayudar al menejo de sesiones y control de acceso a urls
* jsp como motor de plantillas en las vistas
* jstl como libreria de tag para mostrar datos desde el back
* boostrap como framework css

#### Para la solucion de este challenge, se trabaja en varias capas, iniciando como la capa de modelos y repositorio, una capa de servicios rest y entre ellas una capa de servicio que interactua entre el repositorio y los servicios rest.
#### Se contruye una capa de Controladores que solo Consumen los servicios rest y nos lleva a las vistas contruidas en jsp requeridas por el usuario.
#### El control de acceso a los controladres es manejado por spring security, el que permite 2 tipos de acceso (alumno y administrador) y nos dirige a un index manejado en el controlador que nos lleva a una vista segun el tipo de usuario logueado.
#### Las urls de alumno y de administrador son solo accesible por el tipo de usuario asociado a esas vistas