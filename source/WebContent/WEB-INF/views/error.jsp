<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>

</head>
<body>
    <div>
            <div>
		<p><strong>Notice: </strong>An error has occurred.</p>
                <p><strong>Cause: </strong>${exception.message}</p>
            </div>
    </div>
</body>
</html>
