<#import "home/homepage.ftl" as p>
<@p.pages>

    <h2>Home</h2>

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

    <div class="row row-cols-1 row-cols-md-2 g-4">
        <div class="col">
            <div class="card">
                <img src="/static/images/students.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">All Students</h5>
                    <p class="card-text">The list of all students</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img src="/static/images/group.png" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">All Groups</h5>
                    <p class="card-text">The list of all groups</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img src="/static/images/course.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">All Courses</h5>
                    <p class="card-text">The list of all courses</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img src="/static/images/discipline.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">All Disciplines</h5>
                    <p class="card-text">The list of all disciplines</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card">
                <img src="/static/images/truancy.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">All Truancies</h5>
                    <p class="card-text">The list of all truancies</p>
                </div>
            </div>
        </div>
    </div>
</@p.pages>