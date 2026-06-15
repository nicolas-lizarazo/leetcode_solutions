# [Número y Nombre del Problema] (Ej: 1431. Kids With the Greatest Number of Candies)

## 📌 Problem Description
[Copia aquí la descripción breve del problema en inglés]

## 💡 Intuition & Approach
Explain your thought process here. For example:
"My first thought was to find the maximum value in the array because we need it as a baseline for comparison. 
Then, I iterated through the array again to check if each kid's candies plus the extra candies could reach or exceed that maximum."

## ⚙️ Complexity Analysis
- **Time Complexity:** $O(n)$ because we traverse the array twice in independent loops.
- **Space Complexity:** $O(1)$ auxiliary space (excluding the output list) since we modify or check data in-place.

## 🛠️ Key Lessons Learned
- Learned how to handle edge cases at the boundaries of the array (`i == 0` and `i == length - 1`).
- Avoided unnecessary memory allocation by modifying the array in-place.