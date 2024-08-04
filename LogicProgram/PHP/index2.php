<?php

if(isset($_POST['submit'])){
    $name = $_POST['name'];
    $numero = $_POST['numero'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $message = $_POST['message'];
    $to = "your-email@gmail.com";
    $subject = "Contact Form";
    $body = "Name: $name\nEmail: $email\nPhone: $phone\n
    Message: $message";
    $headers = "From: $email";
    if(mail($to, $subject, $body, $headers)){
        echo "Email sent successfully";
        }else{
            echo "Failed to send email";
            }

    if(strlen($nome) >= 5){
        echo 'Nosso nome >= 5';
    }

    if(is_numeric($numero)){
        echo 'O número é um número inteiro';

    }

    if(strstr("@", $email) != ''){
        echo 'O email tem @';

        if(strstr("gmail", $email) != ''){

        }
    }
}

?>
<form method="post">
<input type="text" name="name">
<input type="text" name="numero">

<input type="submit" name="submit" value="submit">

</form>