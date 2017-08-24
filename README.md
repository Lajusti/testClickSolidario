# Test Click Solidario StockCrowd

- [Introducción](#introducción)
- [Requisitos](#requisitos)
- [Ejecución](#ejecución)
- [Pruebas](#pruebas)


## Introducción ##

Este proyecto está construido con Spring-boot para que se pueda generar un jar ejecutable el cual levantara la aplicación de prueba en el puerto 8080 de la máquina.

En el código veremos cómo se integra el click solidario de [StockCrowd](https://www.stockcrowd.com/) en una aplicación web con tecnología Java y como se visualiza en los principales frameworks de frontend (bootstrap y materialize).

## Requisitos ##

- **maven**: recomendamos versión 3.5
- **java**: 1.8

## Ejecución ##

Una vez descargado el código nos situamos en el directorio descargado y ejecutamos la orden maven: **mvn package**. 

Una vez finaliza la ejecución de la instrucción, entramos en el directorio **target**, generado, y ejecutamos la siguiente instrucción: **java -jar testClickSolidario-1.0.jar**.

Ahora ya tenemos levantado la aplicación web para testear la integración.

## Pruebas ##

Disponemos de los siguientes endpoints para ver los diferentes tipos de integración:
- **[http://localhost:8080/plain](http://localhost:8080/plain)**: Integración en html sin ningún framework, únicamente jquery para facilitar el código javascript mínimo necesario.
- **[http://localhost:8080/bootstrap](http://localhost:8080/bootstrap)**: Integración bajo el framework css bootstrap v4.
- **[http://localhost:8080/materialize](http://localhost:8080/materialize)**: Integración bajo el framework css materialize.
- **[http://localhost:8080/hidden](http://localhost:8080/hidden)**: Integración en la que no se muestra el widget propio de [StockCrowd](https://www.stockcrowd.com/) sino que se obtiene los datos y se pinta como se desea, para no romper el diseño propio del portal.

