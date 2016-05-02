<?php
session_start();
$_SESSION['secret'] = '{mysecret}';
session_write_close();
?>

<!DOCTYPE html>
<html>
<head>

   <!-- Flowplayer library -->
    <script src="//releases.flowplayer.org/6.0.4/flowplayer.min.js"></script>

    <!-- Flowplayer hlsjs engine -->
    <script src="//releases.flowplayer.org/hlsjs/flowplayer.hlsjs.min.js"></script>

   <!-- player styling -->
   <link rel="stylesheet" type="text/css" href="skin/minimalist.css">

</head>

<body>
   
   <script>
      flowplayer(function (api, root) {
      var bean = flowplayer.bean,
      common = flowplayer.common;

      bean.on(root, "click", function () {
      if (api.splash) {
      common.xhrGet("hlsengine.php", common.noop, common.noop);
    }
  });
});


window.onload = function () {

  flowplayer("#player", {
    ratio: 4/9,
    splash: true,
    bgcolor: "#333333",

    embed: false,

    clip: {
      sources: [
        { type: "application/x-mpegurl",
          src:  "your_path" }
      ]
    }
  });

};

   </script>

</body>

<div id="player" class="is-closeable"></div>
</html>
