<#import "course/coursepage.ftl" as p>
<@p.pages>

<h2>Course</h2>

<nav aria-label="...">
    <ul class="pagination">
        <li class="page-item disabled">
            <a class="page-link">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item active" aria-current="page">
            <a class="page-link" href="#">2</a>
        </li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Number</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>1</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>2</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>3</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>4</td>
        </tr>
        <tr>
            <th scope="row">5</th>
            <td>5</td>
        </tr>
        </tbody>
    </table>
</@p.pages>