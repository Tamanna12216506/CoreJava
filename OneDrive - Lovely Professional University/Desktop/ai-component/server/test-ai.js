// server/test-ai.js
import dotenv from "dotenv";
dotenv.config();

import { GoogleGenerativeAI } from "@google/generative-ai";

const genAI = new GoogleGenerativeAI(process.env.GEMINI_API_KEY);

async function testGemini() {
  try {
    const model = genAI.getGenerativeModel({ model: "gemini-1.5-pro" });
    const result = await model.generateContent("Write a function in JavaScript to reverse a string.");
    const response = await result.response;
    console.log("✅ Gemini Output:\n", response.text());
  } catch (error) {
    console.error("❌ Gemini API Error:", error);
  }
}

testGemini();
