function submitRegistration(data) {
  console.log("Sending data...");
  setTimeout(() => {
    fetch("https://example.com/api/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(response => alert("Registered successfully!"))
    .catch(err => alert("Registration failed."));
  }, 2000);
}
