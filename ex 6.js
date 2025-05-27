let events = [];

events.push({ name: "Concert", category: "music" });
events.push({ name: "Workshop", category: "education" });

let musicEvents = events.filter(e => e.category === "music");

let display = events.map(e => `${e.category.toUpperCase()} - ${e.name}`);
console.log(display);
