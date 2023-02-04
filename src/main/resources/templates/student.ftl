<#import "student/studentpage.ftl" as p>
<@p.pages>

<h2>Student</h2>

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
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Middle Name</th>
            <th scope="col">Lesson Type</th>
            <th scope="col">Mark</th>
            <th scope="col">Course</th>
            <th scope="col">Group</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>Andrii</td>
            <td>Povietkin</td>
            <td>Vitaliyovich</td>
            <td>Full-time</td>
            <td>5</td>
            <td>3</td>
            <td>72</td>
        </tr>
        </tbody>
    </table>
</@p.pages>