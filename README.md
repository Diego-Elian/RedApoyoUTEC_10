# Proyecto - Grupo 10 – UTEC

## Descripción

Este proyecto consiste en la implementación de clases en Java a partir de un conjunto de requerimientos funcionales, no funcionales y de dominio.  
El objetivo es representar adecuadamente las entidades clave del sistema y sus relaciones, sin utilizar diagramas de clases.  
En este caso, el sistema modela distintos tipos de usuarios vinculados al acompañamiento académico en la UTEC.

---

## Estructura del proyecto

- Cada clase está implementada en su propio archivo `.java`.
- Se utilizan relaciones entre clases como herencia y asociación.
- Todas las clases implementan el método `toString()` y tienen constructores.
- No se incluye el método `main()`, ya que no es necesario para esta entrega.

---

## Supuestos de diseño

- La clase `Usuario` actúa como clase base (padre) y las demás extienden su funcionalidad.
- Se asume que cada tipo de usuario tiene roles y accesos diferenciados, reflejados en los atributos y métodos.
- Los atributos son privados y se accede a ellos mediante getters y setters.
- La cédula de los usuarios no puede ser modificada una vez creado el objeto.
- La autenticación, encriptación y lógica de negocio se implementarán en futuras etapas.

---

## Participantes

| Nombre completo | Roles y Aporte principal |
|-----------------|---------------------------|
| [Diego Piñeyro](https://github.com/Diego-Elian) | Requerimientos y modelado |
| [Samuel Dominguez](https://github.com/SamuelDutec) | Lógica de clases y soporte |
| [Valentina Vega](https://github.com/ValentinaVega34) | Líder del equipo y Coordinación |
| [Sarai Esquiera](https://github.com/saraiesquiera) | Testing / Validación |
| [Elissa Bonilla](https://github.com/elissa-bonilla) | Implementación de clases |

> La participación individual se puede verificar en el historial de commits del repositorio en GitLab.

---

## Requisitos técnicos

- Proyecto desarrollado en Java (versión 17).
- Estructura clara y coherente del código.
- Comentarios explicativos incluidos donde se considere necesario.

---

## Clases implementadas

- `Usuario.java`  
- `Estudiante.java`  
- `Administrador.java`  
- `Psicopedagogo.java`  
- `Funcionario.java`  
- `Analista.java`  

---

## Notas finales

Cada integrante debe tener una copia local del proyecto para la instancia de defensa. El diseño se realizó con foco en claridad, coherencia y reutilización de código mediante herencia.
