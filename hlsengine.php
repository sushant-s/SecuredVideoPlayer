<?php
session_start();
if (isset($_SESSION['secret']) && $_SESSION['secret'] === '{mysecret}') {
  $_SESSION['allow'] = 'on';
}
$_SESSION['allow'] = 'on';
session_write_close();
