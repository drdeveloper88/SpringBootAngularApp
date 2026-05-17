# SpringBootAngularApp

## Overview
A full-stack web application demonstrating modern full-stack development practices with Angular on the frontend and Spring Boot on the backend. This project implements a complete CRUD (Create, Read, Update, Delete) system where users can manage records through a RESTful API, following a client-server architecture.

## Architecture

### Frontend
- **Framework**: Angular
- **Purpose**: Responsive user interface for managing application records
- **Features**: Dynamic data binding, component-based architecture

### Backend
- **Framework**: Spring Boot (Java)
- **Purpose**: RESTful API server and business logic
- **Features**: Robust API endpoints for CRUD operations, data persistence

## Core Features

- ✅ **Create** - Add new records to the system
- ✅ **Read** - Retrieve and display records
- ✅ **Update** - Modify existing records
- ✅ **Delete** - Remove records from the database
- ✅ **REST API** - Full RESTful API implementation
- ✅ **Client-Server Architecture** - Separation of concerns between frontend and backend

## Technology Stack

| Layer | Technology |
|-------|-----------|
| Frontend | Angular |
| Backend | Spring Boot (Java) |
| API | REST |
| Architecture | Client-Server |

## Getting Started

### Prerequisites
- Node.js and npm (for Angular)
- Java Development Kit (JDK) 11 or higher
- Maven or Gradle (for Spring Boot)

### Installation & Setup

**Backend (Spring Boot):**
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

**Frontend (Angular):**
```bash
cd frontend
npm install
ng serve
```

The application will be available at `http://localhost:4200` (Angular) and the API at `http://localhost:8080` (Spring Boot).

## Project Structure

```
SpringBootAngularApp/
├── frontend/          # Angular application
│   ├── src/
│   ├── package.json
│   └── angular.json
├── backend/           # Spring Boot application
│   ├── src/
│   ├── pom.xml
│   └── application.properties
└── README.md
```

## API Endpoints

The Spring Boot backend exposes RESTful endpoints for CRUD operations. Typical endpoints include:

- `GET /api/records` - Retrieve all records
- `GET /api/records/{id}` - Retrieve a specific record
- `POST /api/records` - Create a new record
- `PUT /api/records/{id}` - Update an existing record
- `DELETE /api/records/{id}` - Delete a record

## License

This project is open source and available under the [LICENSE](LICENSE) file.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Author

**drdeveloper88**

---

*This is a learning project demonstrating full-stack web development practices with Spring Boot and Angular.*
