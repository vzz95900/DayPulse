# DayPulse 🎯⏳

**Premium Animated Countdown Progressive Web App (PWA)**

DayPulse lets you create beautiful countdown events directly from your browser. With PWA support, you can install it directly to your phone's home screen without needing an app store, Android Studio, or a complex build process.

---

## ✨ Features

### 🎨 Premium Design
- **Glassmorphism UI** — Frosted glass effects with blur and dynamic borders.
- **Animated Backgrounds** — Canvas-driven floating particles and moving gradients.
- **Progress Rings** — Smooth, animated SVG circular progress indicators.
- **Flip Countdowns** — Bold, dynamic countdown numbers using modern typography.

### 🎯 Smart Countdown Tracking
- "Today!", "Tomorrow", "3 days left" smart labels.
- Live progress bars that fill smoothly based on start/end dates.
- Automatic sorting (Nearest upcoming events first).
- 🎊 Confetti explosions when a countdown hits 0!

### 📱 "Add to Home Screen" (PWA)
- Full-screen app experience on iOS and Android.
- Custom app icon support via `manifest.json`.
- Offline capabilities via LocalStorage.

---

## 🚀 How to Install on Your Phone

Since the app is running on your local network, you can access it directly from your phone's browser and install it as an app!

1. Make sure your phone and your computer are on the **same Wi-Fi network**.
2. Open your phone's browser (Chrome or Safari).
3. Type in the following network address exactly:
   ```
   http://172.22.60.172:5173
   ```
4. **Install as an App:**
   - **Android (Chrome):** Tap the 3 dots menu (⋮) -> **"Add to Home screen"**.
   - **iOS (Safari):** Tap the Share button (square with arrow up) -> **"Add to Home Screen"**.
5. Go to your phone's home screen and open **DayPulse**. It will look and feel like a native app!

---

## 💻 Tech Stack

- **HTML5 & CSS3** (Vanilla CSS, CSS Variables, Flexbox/Grid)
- **Vanilla JavaScript (ES6+)**
- **Vite** (Next-generation frontend tooling)
- **Canvas API** (For 60FPS particle backgrounds)
- **date-fns** (Modern date parsing/manipulation)
- **canvas-confetti** (Celebration animations)

---

## 🔧 Developer Commands

To run the app locally on your machine:

```bash
# Install dependencies
npm install

# Start the dev server (with network exposure)
npm run dev -- --host

# Build for production
npm run build
```
