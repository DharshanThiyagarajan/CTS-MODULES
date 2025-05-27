// Using fetch().then().catch()
fetch("https://example.com/events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error("Failed:", err));

// Using async/await
async function loadEvents() {
  document.body.innerHTML += "<p>Loading...</p>";
  try {
    let res = await fetch("https://example.com/events.json");
    let data = await res.json();
    console.log(data);
  } catch (err) {
    console.error("Error loading events", err);
  }
}
