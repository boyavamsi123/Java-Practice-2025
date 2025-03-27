document.getElementById('loginForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const contactNumber = document.getElementById('contactNumber').value;
    const otp = document.getElementById('otp').value;

    // Send data to the server for validation
    const response = await fetch('/login', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ contactNumber, otp })
    });

    const result = await response.json();
    if (result.success) {
      alert('Login Successful!');
    } else {
      alert('Login Failed: ' + result.message);
    }
  });