# VehicleRental
## Descripción del proyecto
Este proyecto es una aplicación de alquiler de vehículos que permite la gestión de los diferentes tipos de vehículos que se ofrecen para alquilar. La aplicación cuenta con una capa de servicio (API) que permite realizar operaciones CRUD en los vehículos y mantener un registro de los mantenimientos realizados en cada uno de ellos.


La aplicación está construida con Java 8, Spring Boot, Spring JPA, Lombok y Junit. La base de datos utilizada es SQL.

La estructura del proyecto incluye los siguientes paquetes y clases:

* ` model `: contiene las clases Vehicle, Car , Truck y Maintenance que representan los modelos de la aplicación.
* ` repository `: contiene la interfaz VehicleRepository y MaintenanceRepository que proporciona acceso a la base de datos.
* ` service `: contiene la clase VehicleService  y MaintenanceService que proporciona la lógica de negocios para la gestión de los vehículos y su mantenimiento.
* ` controller `: contiene la clase VehicleController y MaintenanceController que proporciona los puntos de acceso a la API de la aplicación.

## Descripción de endpoints

La aplicación proporciona los siguientes endpoints:

### Vehículos
* GET  ` api/v1/vehicles ` : obtiene una lista de todos los vehículos almacenados en la base de datos.

* GET `api/v1/vehicles/{id} `: obtiene un vehículo específico por su ID.

* POST ` api/v1/vehicles `: agrega un nuevo vehículo a la base de datos.

* PUT ` api/v1/vehicles/{id} `: actualiza un vehículo existente en la base de datos.

* DELETE ` api/v1/vehicles/{id} `: elimina un vehículo de la base de datos.

### Mantenimientos
* GET ` api/v1/vehicles/{vehicleId}/maintenance `: obtiene una lista de todos los mantenimientos realizados.

* GET `api/v1/vehicles/{vehicleId}/maintenance/{id} `: obtiene una lista de todos los mantenimientos realizados en un vehículo específico.

* POST ` api/v1/vehicles/{vehicleId}/maintenance`: agrega un nuevo mantenimiento a un vehículo específico.

* PUT ` api/v1/vehicles/{vehicleId}/maintenance/{id} `: actualiza un mantenimiento existente en la base de datos.

* DELETE ` api/v1/vehicles/{id} `: elimina un mantenimiento de la base de datos.
