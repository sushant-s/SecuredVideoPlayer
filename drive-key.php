<?php
session_start();

if (isset($_SESSION['secret']) && $_SESSION['secret'] === '{mysecret}' &&
    isset($_SESSION['allow']) && $_SESSION['allow'] === 'on') {
  header('Content-Type: binary/octet-stream');
  header('Pragma: no-cache');
  readfile('drive.key');
} else {
  header('HTTP/1.0 403 Forbidden');
}

$_SESSION['allow'] = 'off';
session_write_close();
