<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<%--  <style>--%>
<%--      html, body{height: 100%}body{background-color: #4052e4;display: grid;place-items: center}.card{padding: 0px 15px;border-radius: 20px}.c1{background-color: #fff2f1;border-radius: 20px}a{margin: 0px;font-size: 13px;border-radius: 7px;text-decoration: none;color: black}a:hover{color: #e0726c;background-color: #fff2f1}.nav-link{padding: 1rem 1.4rem;margin: 0rem 0.7rem}.ac{font-weight: bold;color: #e0726c;font-size: 12px}input, button{width: 96%;background-color: #fff2f1;border-radius: 8px;padding: 8px 17px;font-size:13px;border: 1px solid #f5f0ef;color: #dccece}input:{text-decoration: none}.bt{background-color: #ff4133;border: 1px solid rgb(300, 200, 200)}form{margin-top: 70px}form >*{margin: 10px 0px}#forgot{margin: 0px -60px}#register{text-align: center}img{background-color: antiquewhite}.wlcm{font-size: 30px}.sp1{font-size: 5px}.sp1 >span{background-color: #f0c3be}--%>
<%--  </style>--%>
</head>
<body>
<div class="container-fluid p-2 bg-primary text-white text-center">
    <h1>Soft Token </h1>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col">

            <img src="https://fintechngr.com/wp-content/uploads/2022/10/istockphoto-1329694880-612x612-1.jpg"
                 class="rounded" alt="Cinque Terre" width="500" height="400">
<%--            <img src="../img/soft_token2.jpg" class="rounded" alt="Cinque Terre" width="304" height="236">--%>
        </div>
        <div class="col">
            <form action="/soft-token/registration" method="post">
                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                </div>


                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Organization Code:</label>
                    <input type="number" class="form-control" id="organizationCode" placeholder="Enter Organization Code" name="organizationCode">
                </div>

                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Token Type:</label>
                    <select class="form-select form-select-lg" name="tokenType">
                        <option value="">--Select Token Type---</option>
                        <option value="M">Soft Token by mobile device</option>

                    </select>
                </div>

                <div class="form-check mb-3">
                    <label class="form-check-label">
                        <input class="form-check-input" type="checkbox" name="remember"> Remember me
                    </label>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>