<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Scan QR</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Scan Soft Token</h2>
    <p>Please verify the soft token</p>
    <div class="card" style="width:400px">
        <img class="card-img-top" src="http://localhost:8083/soft-token/image/qr/${qrData}" alt="Card image" style="width:100%">
        <div class="card-body">
            <h4 class="card-title">${name}</h4>
            <p class="card-text">${email}</p>
            <p class="card-text">${softToken}</p>
        </div>
    </div>
    <br>


</div>

</body>
</html>