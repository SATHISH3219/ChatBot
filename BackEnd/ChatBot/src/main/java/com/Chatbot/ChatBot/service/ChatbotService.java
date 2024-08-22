package com.Chatbot.ChatBot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getResponse(String message) {
        // Convert message to lowercase for case-insensitive comparison
        String lowerCaseMessage = message.trim().toLowerCase();
        System.out.println("Received message: " + lowerCaseMessage); // Debugging log

        // Simple response logic
        if (lowerCaseMessage.contains("hello")||lowerCaseMessage.contains("hi")||lowerCaseMessage.contains("hai")) {
            return "Hello! How can I assist you today?";
        } else if (lowerCaseMessage.contains("bye")) {
            return "bye!";
        } else if (lowerCaseMessage.contains("fees")) {
            return getFeesDetails(lowerCaseMessage); // Ensure lowerCaseMessage is passed
        } else {
            return "Sorry, I didn't understand that.";
        }
    }

    private String getFeesDetails(String message) {
        // Debugging log
        System.out.println("Processing fees details for message: " + message); 
        // Basic logic to determine fees details
        if (message.contains("for tuition")||message.contains("for college")||message.contains("for semester")) {
            return "The tuition fee is Rs.50000 per semester.";
        } else if (message.contains("for library")) {
            return "The library fee is Rs.2000 per year.";
        } else if (message.contains("for hostel")) {
            return "The hostel fee is Rs.150000 per semester.";
        } else {
            return "Please specify the type of fee you're inquiring about. You can ask about tuition, library, or hostel fees. For example, you could say 'What is the tuition fee?'.";
        }
    }
}
