<!DOCTYPE html>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<style type="text/css">
    .note
    {
        text-align: center;
        height: 80px;
        background: -webkit-linear-gradient(left, #0072ff, #8811c5);
        color: #fff;
        font-weight: bold;
        line-height: 80px;
    }
    .form-content
    {
        padding: 5%;
        border: 1px solid #ced4da;
        margin-bottom: 2%;
    }
    .form-control{
        border-radius:1.5rem;
    }
    .btnSubmit
    {
        border:none;
        border-radius:1.5rem;
        padding: 1%;
        width: 20%;
        cursor: pointer;
        background: #0062cc;
        color: #fff;
    }
</style>
<body>

<form action="evregistor" >
    <div class="container">
        <div class="container register-form">
            <div class="form">
                <div class="note">
                    <p>This is a Event registor page.</p>
                </div>

                <div class="form-content">
                    <div class="row">

                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" name="name" placeholder="Your Name *" value=""/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="pnumber" placeholder="Phone Number *" maxlength="10" value=""/>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" name="emailid" placeholder="Email id *" value=""/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" name="eventname" placeholder="Event name *" value=""/>
                            </div>
                            <div class="form-group">
                                <input type="date" class="form-control" name="eventdate" placeholder="Event Date *" value=""/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="eventlocation" placeholder="Event Location" value=""/>
                            </div>
                        </div>
                    </div>
                    <button type="submit" class="btnSubmit">Submit</button>
                </div>
                <p>${esuccess}</p>
                <p>${eerror}</p>
            </div>
        </div></div>
</form>

</body>
</html>