const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());

app.get('/greet', function (req, resp) {
    //to send this text, we use send() in resp.
    resp.send("Welcome to Express Server...");
});

//to run in server at 3000 port
app.listen(3000, function () {
    console.log("Express Server is running at port 3000.");
});
//to run this in browser: http://localhost:3000/greet