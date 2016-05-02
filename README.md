# SecuredVideoPlayer

It's the whole setup to provide end to end secured premium video streaming using AES encryption on web platform.

-> First break the files into chunks and encode it into aac format if already not in that using ffmpeg library (ffmpeg.php).
-> Then encrypt the files using AES encryption algorithm (Encrypt.java)
-> Then using session_id and other verification techniques, it is ensured that video is not downloaded without permission.
