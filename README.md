# 📓 iNotebook - Full Stack Note-Taking Application

A full-stack note-taking application with a React frontend and Spring Boot + MongoDB backend, providing CRUD operations for notes with a user-friendly interface.

## 🚀 Features

- 📝 **Create Notes**: Add new notes with title, description, and tags
- 👀 **Read Notes**: View all notes in a responsive grid layout
- ✏️ **Update Notes**: Edit existing notes with instant updates
- 🗑️ **Delete Notes**: Remove notes with confirmation
- ✅ **Form Validation**: Client-side validation for note content
- 📱 **Responsive Design**: Works on both desktop and mobile devices
- 🖼️ **Sticky Note UI**: Colorful card-based interface with hover effects
- ⚠️ **Error Handling**: Clear error messages for failed operations

## 🛠️ Technologies Used

### Frontend
- ⚛️ React (v18+)
- 🧭 React Router
- 🖌️ Bootstrap 5
- 🖼️ Font Awesome Icons
- 🌐 HTML5/CSS3

### Backend
- ☕ Spring Boot 3
- 📦 Spring Data MongoDB
- ☕ Java 17+
- 🗃️ MongoDB
- 🧪 Maven

## 💻 Installation

### Prerequisites
- ☕ Java Development Kit (JDK 17+)
- 🌐 Node.js (v16+)
- 🗃️ MongoDB Community Edition
- 🧪 Maven

### Backend Setup
1. Clone the repository
2. Navigate to the backend directory:
   # Start MongoDB service
   # Run the Spring Boot application:
   mvn spring-boot:run

Frontend Setup
Navigate to frontend directory:

run
cd frontend

Install dependencies:
run
npm install

Start development server:
run
npm run dev

Configuration

Backend

Port: 8081

MongoDB connection: mongodb://localhost:27017/iNotebook

CORS configured for http://localhost:5173

Frontend
Development server: http://localhost:5173

API base URL: http://localhost:8081/api/notes

API Endpoints
Method	Endpoint	Description
GET	/api/notes	Get all notes
POST	/api/notes	Create new note
PUT	/api/notes/:id	Update existing note
DELETE	/api/notes/:id	Delete note
