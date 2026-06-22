<p align="center">
  <img src="docs/logo-horizontal.png" width="350">
</p>

<h1 align="center">FronteraPOS</h1>

<p align="center">
Sistema de Gestión para Restaurantes
</p>

# 🍽️ FronteraPOS - Backend

API REST desarrollada con Spring Boot para el sistema de gestión de restaurantes **FronteraPOS**.

## 📌 Descripción

Este proyecto corresponde al backend de FronteraPOS, una aplicación para la administración de restaurantes desarrollada como evidencia para el programa de Análisis y Desarrollo de Software del SENA.

La API permite gestionar:

- 📂 Categorías
- 🍽️ Productos
- 🪑 Mesas
- 👤 Usuarios
- 📊 Dashboard

---

## 🚀 Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## 📂 Arquitectura

El proyecto sigue una arquitectura por capas:

Controller
↓
Service
↓
Repository
↓
MySQL

---

## 📡 Endpoints principales

| Método | Endpoint | Descripción |
|---------|----------|-------------|
| GET | /api/categorias | Listar categorías |
| POST | /api/categorias | Crear categoría |
| GET | /api/productos | Listar productos |
| POST | /api/productos | Crear producto |
| GET | /api/mesas | Listar mesas |
| POST | /api/mesas | Crear mesa |
| GET | /api/dashboard | Obtener estadísticas |

---

## ⚙️ Instalación

1. Clonar el repositorio.

```bash
git clone https://github.com/zypher-sentinel/fronterapos-backend.git
```

2. Configurar la base de datos MySQL.

3. Abrir el proyecto con Spring Tools o Eclipse.

4. Ejecutar:

```bash
mvn spring-boot:run
```

---

## 👨‍💻 Autor

**Jhordy Naranjo**

Proyecto desarrollado como evidencia académica para el SENA.